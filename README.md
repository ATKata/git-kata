#Git Kata

Work through the following scenarios one at a time. Do not look ahead until you have completed the previous step.


##Git commands you will need:

add, commit, reset, reflog, stash, pop, apply, branch, checkout, rebase


##Options you will need:

-a
-m "message here"
--amend
--no-edit
--hard










                                                ||
                                                ||
                                                ||
                                                ||
                                               \  /
                                                \/



















##PART I : Basic committing


1a) Do some work on the existing files, add, and commit them



1b) Do some work on the existing files and commit them in one line



2) You forgot a new file you wanted in that commit! Add the file and amend the existing commit with a new message



3) You forgot another change you wanted in that commit! Make the change and amend the commit without changing the message



4) You start doing some work. You then change your mind - get rid of uncommited changes



5) You realise the previous commit makes no sense. Delete it.



6) Actually, you really liked that commit. Get it back.













##PART II : stashing changes

7) You start making changes. A live issue crops up! Stash your changes.



8) You start working on the live issue (in a different file). make a change but do not commit.



9) The live issue turns out to just be ketchup spilled on the graph. You don't want to lose that important fix for a potential live issue though so stash this too.



9) You'd now like to get back to what you were doing before the live ketchup issue. Pick from your stash list and apply it.



10) you may as well apply the potential live issue fix you created too. Pop that stashed change and commit.













##PART III : branching

11) create a branch, make some changes and commit your work



12) make more changes, commit your work, and then rebase this branch onto master.



13) ANOTHER live issue! need a clean master branch. Move the last two commits to a branch.



14) make a change on master, and commit this.



15) rebase your branch onto master









##BONUS PART IV : GIT DAEMONS

Transfer the complete repo via git Daemons to another machine